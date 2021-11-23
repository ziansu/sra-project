public java.util.List<org.latinolib.eval.CrossValidator.FoldData<T, U>> getFolds() {
    return com.google.common.collect.Lists.newArrayList(new java.util.Iterator<org.latinolib.eval.CrossValidator.FoldData<T, U>>() {
        private int current = 0;

        @java.lang.Override
        public boolean hasNext() {
            return (current) < (numFolds);
        }

        @java.lang.Override
        public org.latinolib.eval.CrossValidator.FoldData<T, U> next() {
            return getFold((((current)++) + 1));
        }

        @java.lang.Override
        public void remove() {
            throw new sun.reflect.generics.reflectiveObjects.NotImplementedException();
        }
    });
}