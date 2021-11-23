public void removePocket(int pocket) {
    java.util.List<java.lang.Integer> classList = pockets.get(pockets);
    if (classList == null)
        return ;
    
    classList.forEach(this::remove);
    pockets.remove(pocket);
}