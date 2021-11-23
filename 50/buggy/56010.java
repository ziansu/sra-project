@java.lang.Override
public void execute(projetoum.equipe.iteach.models.ClassObject param) {
    item.setAula(param);
    adapter.remove(item, (-1));
    ((projetoum.equipe.iteach.activities.MainActivity) (ctx)).refreshFeedCount();
}