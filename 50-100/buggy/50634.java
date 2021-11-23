protected void sort(java.util.List<float[]> list, final int position) {
    java.util.Collections.sort(list, new java.util.Comparator<float[]>() {
        @java.lang.Override
        public int compare(float[] o1, float[] o2) {
            if ((o1[position]) > (o2[position]))
                return -1;
            
            if ((o1[position]) < (o2[position]))
                return 1;
            
            return 0;
        }
    });
}