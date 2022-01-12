public static java.lang.String getRandomMessage(java.lang.String user) {
    java.util.Random rand = new java.util.Random();
    int randomNum = rand.nextInt(((ru.qatools.school.vorobushek.web.Resources.TestUser.get(user).size()) + 1));
    if (randomNum > ((ru.qatools.school.vorobushek.web.Resources.TestUser.get(user).size()) - 1))
        randomNum = (ru.qatools.school.vorobushek.web.Resources.TestUser.get(user).size()) - 1;
    
    return ru.qatools.school.vorobushek.web.Resources.TestUser.get(user).get(randomNum);
}