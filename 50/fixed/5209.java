public void rd(java.lang.String path) {
    java.io.File curr = locationController(path);
    if (curr != null) {
        curr.delete();
    }else {
        java.lang.System.out.println("Directory doesn`t exist or cant delete");
    }
}