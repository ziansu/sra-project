@butterknife.OnClick(value = R.id.faq_button)
public void onFaqButtonClicked(android.view.View view) {
    android.content.Intent faqIntent = new android.content.Intent(this, com.piemicrosystems.bancus.ui.activities.help.FAQActivity.class);
    startActivity(faqIntent);
    finish();
}