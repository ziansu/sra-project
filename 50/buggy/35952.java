@java.lang.Override
public void execute() {
    for (org.jtalks.poulpe.model.entity.Rank current : items.getSelection()) {
        rankService.deleteRank(current);
    }
}