public void rd(java.lang.String path) {
    java.io.File curr = locationController(path);
    if ((curr != null) && (curr.canExecute())) {
        curr.delete();
    }else {
        java.lang.System.out.println("Directory doesn`t exist or cant delete");
    }
}