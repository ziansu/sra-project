public void endast(int confNo, int no) {
    try {
        s.endast(confNo, no);
    } catch (nu.dll.lyskom.RpcFailure e) {
        e.printStackTrace();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}