@java.lang.Override
public void run() {
    int num = mRandom.nextInt(4);
    imageView.setImageResource(mImgsAnim[num]);
}