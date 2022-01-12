public void addWay(io.github.macfja.citiesborder.XmlHandler.Way way) {
    if (way == null) {
        return ;
    }
    ways.add(way.toString());
}