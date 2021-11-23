public void onBind(io.jawg.osmcontributor.model.entities.PoiType item) {
    text.setText(item.getName());
    technicalName.setText(item.getTechnicalName());
    details.setText(itemView.getContext().getResources().getQuantityString(R.plurals.tag_number, item.getTags().size(), item.getTags().size()));
    icon.setImageDrawable(bitmapHandler.getDrawable(item.getIcon()));
}