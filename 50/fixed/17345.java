@java.lang.Override
public boolean isUserOriginator(int id, java.lang.String email) {
    com.chinaglia.model.SwapOrig one = swapRepository.findOne(id);
    if (one.getEmail().equals(email)) {
        return true;
    }else {
        return false;
    }
}