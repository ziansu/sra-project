@java.lang.Override
public void setup() {
    images = new java.util.ArrayList<processing.core.PImage>();
    java.io.File file = new java.io.File("images");
    for (java.io.File f : file.listFiles()) {
        if (f.getName().endsWith(".png"))
            images.add(loadImage(f.getPath()));
        
    }
    g = new Game(this);
}