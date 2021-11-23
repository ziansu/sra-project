private void showDie(int num) {
    for (int i = 1; i <= 6; i++) {
        if (its.farkel.MainFarkel.available[i]) {
            android.widget.ImageView v = ((android.widget.ImageView) (findViewById(its.farkel.MainFarkel.ids[i])));
            v.setImageResource(its.farkel.MainFarkel.drawables[num]);
            v.setVisibility(ImageView.VISIBLE);
            its.farkel.MainFarkel.available[i] = false;
            return ;
        }
    }
}