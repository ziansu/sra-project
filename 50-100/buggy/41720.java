public me.asaushkin.lambda.Album copy() {
    java.util.List<me.asaushkin.lambda.Track> tracks = getTracks().map(Track::copy).collect(java.util.stream.Collectors.toList());
    java.util.List<me.asaushkin.lambda.Artist> musicians = getMusicians().map(Artist::copy).collect(java.util.stream.Collectors.toList());
    return new me.asaushkin.lambda.Album(name, tracks, musicians);
}