@java.lang.Override
public void run() {
    for (BeerDB.Brewery brew : guimain.BreweryImageCache.breweries) {
        if (((brew.getBreweryImgUrl()) != null) && (!(guimain.BreweryImageCache.images.containsKey(brew.getBreweryImgUrl())))) {
            guimain.BreweryImageCache.images.put(brew.getBreweryImgUrl(), new javafx.scene.image.Image(brew.getBreweryImgUrl()));
        }
    }
}