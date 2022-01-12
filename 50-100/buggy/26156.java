public static java.util.Iterator<com.jcwhatever.nucleus.utils.text.TextFormat> formatIterator() {
    return new com.jcwhatever.nucleus.collections.wrap.IteratorWrapper<com.jcwhatever.nucleus.utils.text.TextFormat>() {
        java.util.Iterator<com.jcwhatever.nucleus.utils.text.TextFormat> iterator = com.jcwhatever.nucleus.utils.text.TextFormat._characterMap.values().iterator();

        @java.lang.Override
        public void remove() {
            throw new java.lang.UnsupportedOperationException();
        }

        @java.lang.Override
        protected java.util.Iterator<com.jcwhatever.nucleus.utils.text.TextFormat> iterator() {
            return iterator;
        }
    };
}