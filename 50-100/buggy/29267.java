public java.util.List<java.lang.Integer> subPath(int start, int end) {
    try {
        end = java.lang.Math.max(end, ((path.size()) - 1));
        return path.subList(start, (end + 1));
    } catch (java.lang.Exception e) {
        return new java.util.ArrayList<>();
    }
}