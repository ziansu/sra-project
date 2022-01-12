private static void save(java.lang.Object target, android.os.Bundle state) {
    try {
        me.williamhester.knapsack.Bundler bundler = me.williamhester.knapsack.Knapsack.getBundlerForClass(target.getClass());
        bundler.save(state, target);
    } catch (java.lang.IllegalAccessException | java.lang.InstantiationException e) {
        e.printStackTrace();
    }
}