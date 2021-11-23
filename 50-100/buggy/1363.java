public void setSize(android.util.Size size) {
    size_dp = new android.util.Size((((int) (java.lang.Math.ceil(((size.getWidth()) / (scale_dp))))) + 1), (((int) (java.lang.Math.ceil(((size.getHeight()) / (scale_dp))))) + 1));
    this.size = size;
}