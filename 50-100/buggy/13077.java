private void setDirectionButton(android.widget.ImageView imageView, int id, int rotation) {
    android.widget.TableRow.LayoutParams pieceLayout = new android.widget.TableRow.LayoutParams(((height) / 6), ((height) / 6));
    imageView.setLayoutParams(pieceLayout);
    imageView.setOnClickListener(directionClicked);
    imageView.setImageResource(id);
    imageView.setPivotX(((height) / 12));
    imageView.setPivotY(((height) / 12));
    imageView.setRotation(rotation);
}