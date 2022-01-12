public static com.github.yoojia.inputs.Schema RangeValue(final long min, final long max) {
    return com.github.yoojia.inputs.ValueSchema.ABTest(new com.github.yoojia.inputs.RangeValueBridge(max, max)).msg((((("输入数值大小必须在[" + min) + ",") + max) + "]之间"));
}