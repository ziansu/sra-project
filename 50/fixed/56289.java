@org.springframework.data.jpa.repository.Query(value = "select lostItem from LostItem lostItem")
java.util.List<cn.gaoyuexiang.LostAndFound.item.model.entity.LostItem> findAll(org.springframework.data.domain.Pageable pageable);