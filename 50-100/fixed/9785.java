@java.lang.Override
public void onSuccess(java.lang.Object object) {
    if (null != object) {
        heroes = ((com.example.pratik.dota2profile.beans.Heroes) (object));
        for (com.example.pratik.dota2profile.beans.Hero i : heroes.getResult().getHeroes()) {
            heroesMap.put(java.lang.Integer.parseInt(i.getId()), i.getLocalizedName());
        }
    }
}