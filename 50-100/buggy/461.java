public static com.github.yoojia.inputs.Schema RangeValue(final int min, final int max) {
    return com.github.yoojia.inputs.ValueSchema.ABTest(new com.github.yoojia.inputs.RangeValueBridge(max, max)).msg((((("输入数值大小必须在[" + min) + ",") + max) + "]之间"));
}