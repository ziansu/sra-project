public void sort(java.util.List<java.util.Map.Entry<java.lang.Class, java.lang.Long>> entries) {
    java.util.Collections.sort(entries, new java.util.Comparator<java.util.Map.Entry<java.lang.Class, java.lang.Long>>() {
        @java.lang.Override
        public int compare(java.util.Map.Entry<java.lang.Class, java.lang.Long> o1, java.util.Map.Entry<java.lang.Class, java.lang.Long> o2) {
            return o1.getValue().compareTo(o2.getValue());
        }
    });
}