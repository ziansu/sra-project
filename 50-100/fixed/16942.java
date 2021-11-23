@java.lang.Override
public edu.hm.shareit.Services.MediaServiceResult updateDisc(edu.hm.shareit.models.Disc d) {
    edu.hm.shareit.Services.MediaServiceResult res = MediaServiceResult.SUCCESS;
    int index = -1;
    try {
        for (int i = 0; (i <= (edu.hm.shareit.Services.MediaServiceImpl.bookList.size())) && (!(edu.hm.shareit.Services.MediaServiceImpl.disclist.get(i).equals(d))); i++) {
            index = i;
        }
        edu.hm.shareit.Services.MediaServiceImpl.disclist.remove(index);
        edu.hm.shareit.Services.MediaServiceImpl.disclist.add(d);
        res = MediaServiceResult.SUCCESS;
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        res = MediaServiceResult.SUCCESS;
    }
    return res;
}