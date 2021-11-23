@java.lang.Override
public java.util.Set<ru.yandex.qatools.ashot.coordinates.Coords> prepare(java.util.Collection<ru.yandex.qatools.ashot.coordinates.Coords> coordinates) {
    return ru.yandex.qatools.ashot.coordinates.Coords.setReferenceCoords(screenshot.getOriginShift(), ru.yandex.qatools.ashot.coordinates.Coords.intersection(screenshot.getCoordsToCompare(), coordinates));
}