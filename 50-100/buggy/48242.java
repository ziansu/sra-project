@org.junit.Before
public void setUp() {
    pageable = new org.springframework.data.domain.PageRequest(0, 20);
    objectiveList1 = new seed.domain.ObjectiveList("tech");
    objectiveList2 = new seed.domain.ObjectiveList("health");
    objectiveList3 = new seed.domain.ObjectiveList("tech");
    objectiveList1.setDescription("objective for tech");
    objectiveList2.setDescription("objective for health");
    objectiveList3.setDescription("another objective for tech");
    id1 = objectiveListRepository.insert(objectiveList1).getId();
}