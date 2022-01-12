@java.lang.Override
public void onBindViewHolder(com.lufficc.demolightadapter.model.ImgModel imgModel, com.lufficc.demolightadapter.viewprovider.ImgViewProvider.ImgViewHolder viewHolder, int position) {
    viewHolder.imageView.setImageResource(imgModel.getImgId());
}