public static void main(java.lang.String[] args) throws java.lang.Exception {
    com.athena.peacock.controller.web.ceph.object.ObjectStorageController osc = new com.athena.peacock.controller.web.ceph.object.ObjectStorageController();
    osc.connectionRadosGW();
    osc.listOfBucktes();
}