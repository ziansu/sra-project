@java.lang.Override
public void assignApplicationToAccount(ch.heigvd.amt.gamification.model.Application app, ch.heigvd.amt.gamification.model.Account acc) {
    app.setAcount(acc);
    acc.getApps().add(app);
    ch.heigvd.amt.gamification.model.ApiKey key = getNewApiKey();
    app.setApiKey(key);
    key.setApplication(app);
    em.persist(app);
    em.flush();
}