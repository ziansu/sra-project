public static com.adam.app.pattern.flywieght.Pen getPencel(java.lang.String style) {
    com.adam.app.pattern.flywieght.Pencil pen = ((com.adam.app.pattern.flywieght.Pencil) (com.adam.app.pattern.flywieght.PencilFactory.map.get(style)));
    if (pen == null) {
        pen = new com.adam.app.pattern.flywieght.Pencil();
        com.adam.app.pattern.flywieght.PencilFactory.map.put(style, pen);
    }
    return pen;
}