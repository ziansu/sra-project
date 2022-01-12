public static void main(java.lang.String[] args) {
    java.lang.System.out.println("Hi, I am your Drone application!");
    java.lang.System.out.println("");
    droneandshare.Media media = new droneandshare.Media("sky.jpg");
    media.showProperty();
    java.lang.System.out.println("");
    droneandshare.Picture picture = new droneandshare.Picture("yellow.jpg");
    picture.showProperty();
    picture.crop(10, 20, 100, 500);
    droneandshare.Media myMedia = new droneandshare.Picture("myPicture.jpg");
    myMedia.showProperty();
    myMedia.crop(10, 20, 100, 500);
}