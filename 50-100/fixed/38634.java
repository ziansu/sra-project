private org.bytedeco.javacpp.opencv_core.Mat getMat() {
    while (true) {
        f = read();
        if ((f) != null) {
            break;
        }else {
            continue;
        }
    } 
    if ((resize.factor) > 1) {
        return resize.update(f);
    }else {
        return f;
    }
}