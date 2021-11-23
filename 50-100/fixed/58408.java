static <T extends org.daisy.dotify.common.split.SplitPointUnit> org.daisy.dotify.common.split.SplitResult<T> getResult(org.daisy.dotify.common.split.SplitPointDataSource<T> data, int tailStart) {
    if (tailStart == 0) {
        return new org.daisy.dotify.common.split.SplitResult<T>(java.util.Collections.emptyList(), data);
    }else
        if (data.hasElementAt((tailStart - 1))) {
            return data.split(tailStart);
        }else {
            return new org.daisy.dotify.common.split.SplitResult<T>(data.getRemaining(), org.daisy.dotify.common.split.SplitPointDataList.emptyManager());
        }
    
}