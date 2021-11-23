@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET, path = "/get")
public java.util.Collection<at.fhhgb.mc.archivist.model.Score> get(@org.springframework.web.bind.annotation.RequestParam(value = "musicPieceId")
java.lang.Integer musicPieceId) {
    java.util.Collection<at.fhhgb.mc.archivist.model.Score> result = new java.util.LinkedList<at.fhhgb.mc.archivist.model.Score>();
    at.fhhgb.mc.archivist.model.Musicpiece p = new at.fhhgb.mc.archivist.model.Musicpiece();
    p.setMusicPieceId(musicPieceId);
    java.util.Iterator<at.fhhgb.mc.archivist.model.Score> it = repository.findByMusicpiece_MusicPieceId(musicPieceId).iterator();
    while (it.hasNext()) {
        at.fhhgb.mc.archivist.model.Score current = it.next();
        prepareForSerialization(current);
        result.add(current);
    } 
    return result;
}