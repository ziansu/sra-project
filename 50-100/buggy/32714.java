@java.lang.Override
public main.LoadedImage transform(main.LoadedImage img) {
    main.LoadedImage newImage = new main.LoadedImage(img);
    for (int i = 0; i < (newImage.pxImage.length); i++) {
        for (int j = 0; j < (newImage.pxImage[i].length); j++) {
            newImage.pxImage[i][j] = $missing$;
        }
    }
    return newImage;
}