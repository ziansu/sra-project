public void RemoveWindow(int MDI_CLASS_INDEX) {
    if (MDI_CLASS_INDEX >= 0) {
        java.lang.String removedWindow = MDIClasses.get(MDI_CLASS_INDEX).filename;
        for (int jm = 0; jm < (jMenuView.getItemCount()); jm++) {
            java.lang.String thisFileItemString = jMenuView.getItem(jm).getText();
            if (thisFileItemString.equals(removedWindow)) {
                jMenuView.remove(jm);
            }
        }
        MDIClasses.remove(MDI_CLASS_INDEX);
    }
}