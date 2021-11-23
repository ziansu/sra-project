public static cf.rachlinski.autoEval.storage.export.project.Sector createSector(char id, java.lang.String string) {
    try {
        return new cf.rachlinski.autoEval.storage.export.project.Sector(new cf.rachlinski.autoEval.storage.export.project.Header(id, string.getBytes("UTF-8").length), string.getBytes("UTF-8"));
    } catch (java.io.UnsupportedEncodingException e) {
        e.printStackTrace();
    }
    return null;
}