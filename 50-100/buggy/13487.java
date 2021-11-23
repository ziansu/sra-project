@java.lang.Override
public void onBindViewHolder(org.keynote.godtools.android.newnew.adapters.LanguageSelectionAdapter.ViewHolder holder, int position) {
    org.keynote.godtools.android.business.GTLanguage gtLanguage = mLanguages.get(position);
    holder.mOuterLayout.setSelected(true);
    holder.mTitle.setText(gtLanguage.getLanguageName());
    if (gtLanguage.isDownloaded()) {
        holder.mDownloadImageButton.setImageDrawable(mRedDelete);
    }else {
        holder.mDownloadImageButton.setImageDrawable(mGreenDownload);
    }
    if (gtLanguage.getLanguageCode().equalsIgnoreCase(mCurrentlySelectedCode)) {
        activateListItem(holder.mOuterLayout);
    }else {
        deactivateListItem(holder.mOuterLayout);
    }
}