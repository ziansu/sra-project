@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    android.view.MenuInflater menuInflater = getMenuInflater();
    menuInflater.inflate(R.menu.common_menu, menu);
    android.view.MenuItem classTitle = menu.findItem(R.id.number_of_class);
    int realClassNumber = (classId) + 4;
    if (realClassNumber > 12)
        realClassNumber = 5 - (realClassNumber - 11);
    
    if ((classId) == (-1))
        classTitle.setVisible(false);
    
    classTitle.setTitle((realClassNumber + " класс"));
    return super.onCreateOptionsMenu(menu);
}