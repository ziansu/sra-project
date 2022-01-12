public void removeMovingImage(AnimationDemo.MovingImage mi) {
    for (int i = 0; i < (images.size()); i++) {
        if (images.get(i).equals(mi)) {
            images.remove(i);
            return ;
        }
    }
}