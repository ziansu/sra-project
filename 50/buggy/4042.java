@de.greenrobot.event.Subscribe
public void onGetProductDTOEvent(com.example.winify.cvsi.dto.ListDto<com.example.winify.cvsi.dto.templates.ProductTemplate> event) {
    android.widget.Toast.makeText(this, ("ceva" + (event.getList().get(0).getTitle())), Toast.LENGTH_SHORT).show();
}