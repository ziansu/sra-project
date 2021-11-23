public java.lang.Iterable<com.anteambulo.SeleniumJQuery.jQuery> each() {
    return new java.lang.Iterable<com.anteambulo.SeleniumJQuery.jQuery>() {
        @java.lang.Override
        public java.util.Iterator<com.anteambulo.SeleniumJQuery.jQuery> iterator() {
            return new java.util.Iterator<com.anteambulo.SeleniumJQuery.jQuery>() {
                int i = 0;

                @java.lang.Override
                public boolean hasNext() {
                    return (length) > (i);
                }

                @java.lang.Override
                public com.anteambulo.SeleniumJQuery.jQuery next() {
                    return new com.anteambulo.SeleniumJQuery.jQuery(jqf, jqf.createId(), get(((i)++)));
                }

                @java.lang.Override
                public void remove() {
                }
            };
        }
    };
}