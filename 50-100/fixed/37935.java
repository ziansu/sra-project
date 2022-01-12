@java.lang.Override
public void onClick(android.view.View v) {
    model.Entry entry = new model.Entry(m_auth.getCurrentUser().getUid(), new java.util.Date());
    adapter.add(("Button clicked: " + (entry.getDate().toString())));
    m_fbHelper.write(entry, FirebaseHelper.ENTRY);
}