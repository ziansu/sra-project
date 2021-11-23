public static com.z4.zoptimization.ZOptimization.ZOptimizationBuilder withContext(android.content.Context context) {
    com.z4.zoptimization.ZOptimization.init(context);
    return com.z4.zoptimization.ZOptimization.get().new ZOptimizationBuilder();
}