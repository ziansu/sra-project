public void onClick(android.view.View v) {
    if ((v.getId()) == (R.id.blogimage)) {
        imageView.setImageResource(R.drawable.blog2);
        imageView.setEnabled(false);
        thread.start();
    }
}