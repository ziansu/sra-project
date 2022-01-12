@com.google.common.eventbus.Subscribe
public void applyNoise(ar.edu.itba.controllers.ApplyNoise noise) {
    this.imageAfter = ar.edu.itba.models.ImageMatrix.readImage(this.imageBefore.getImage(false));
    this.imageAfter.applyNoise(noise.getNoiseType(), noise.getGenerator(), noise.getPercentage());
    eventBus.post(new ar.edu.itba.controllers.ImageModified(ar.edu.itba.models.ImageMatrix.readImage(imageAfter.getImage(false))));
}