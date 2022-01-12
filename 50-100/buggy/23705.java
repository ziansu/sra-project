private com.badlogic.gdx.spriter.data.SpriterFileInfo applyCharacterMaps(com.badlogic.gdx.spriter.data.SpriterFileInfo file) {
    if ((characterMaps.size) > 0) {
        for (int i = (characterMaps.size) - 1; i >= 0; i--) {
            com.badlogic.gdx.spriter.data.SpriterCharacterMap characterMap = characterMaps.get(i);
            for (com.badlogic.gdx.spriter.data.SpriterMapInstruction map : characterMap.maps) {
                if (((map.file.equals(file)) && ((map.target.folderId) >= 0)) && ((map.target.fileId) >= 0))
                    return map.target;
                
            }
        }
    }
    return file;
}