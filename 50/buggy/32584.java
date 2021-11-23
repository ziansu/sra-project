@java.lang.Override
public void execute(projetoum.equipe.iteach.models.ClassObject param) {
    item.setAula(param);
    adapter.add(item);
    ((projetoum.equipe.iteach.activities.MainActivity) (ctx)).refreshFeedCount();
}