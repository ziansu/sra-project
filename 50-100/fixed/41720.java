public me.asaushkin.lambda.Album copy() {
    return new me.asaushkin.lambda.Album(name, getTracks().map(Track::copy).collect(java.util.stream.Collectors.toList()), getMusicians().map(Artist::copy).collect(java.util.stream.Collectors.toList()));
}