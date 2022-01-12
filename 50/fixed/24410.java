public Vector.BookVector[] recommendBook(int userID, int amount) {
    java.util.PriorityQueue<Vector.KNNUserVector> users = findSimiUser(userID, amount);
    return knnSearch(users, amount);
}