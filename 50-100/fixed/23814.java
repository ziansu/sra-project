private com.badlogic.gdx.utils.Array<com.sidescroller.objects.RubeSprite> createRubeSprites(com.badlogic.gdx.utils.Array<com.sidescroller.Map.RubeLoader.gushikustudios.loader.serializers.utils.RubeImage> rubeImages, com.sidescroller.Map.Map map) {
    if (rubeImages != null) {
        com.badlogic.gdx.utils.Array<com.sidescroller.objects.RubeSprite> rubeSprites = new com.badlogic.gdx.utils.Array<com.sidescroller.objects.RubeSprite>(1);
        for (com.sidescroller.Map.RubeLoader.gushikustudios.loader.serializers.utils.RubeImage rubeImage : rubeImages) {
            rubeSprites.add(new com.sidescroller.objects.RubeSprite(rubeImage));
        }
        map.updateLayerDepth(rubeSprites);
        return rubeSprites;
    }else {
        return null;
    }
}