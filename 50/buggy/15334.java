public void addWay(io.github.macfja.citiesborder.XmlHandler.Way way) {
    if (way == null) {
        return ;
    }
    ways.append('\n').append(way);
}