public static ge.edu.freeuni.sdp.xo.rooms.data.Repository createInMemoryRepository() {
    if ((ge.edu.freeuni.sdp.xo.rooms.data.FakeRepositoryFactory.repo) == null) {
        ge.edu.freeuni.sdp.xo.rooms.data.FakeRepositoryFactory.repo = ge.edu.freeuni.sdp.xo.rooms.data.InMemoryRepository.getInstance();
        ge.edu.freeuni.sdp.xo.rooms.data.Room empty = new ge.edu.freeuni.sdp.xo.rooms.data.Room(1, null, null);
        ge.edu.freeuni.sdp.xo.rooms.data.Room one = new ge.edu.freeuni.sdp.xo.rooms.data.Room(2, 1, null);
        ge.edu.freeuni.sdp.xo.rooms.data.Room full = new ge.edu.freeuni.sdp.xo.rooms.data.Room(3, 1, 2);
        ge.edu.freeuni.sdp.xo.rooms.data.FakeRepositoryFactory.repo.insertOrUpdate(full);
        ge.edu.freeuni.sdp.xo.rooms.data.FakeRepositoryFactory.repo.insertOrUpdate(one);
        ge.edu.freeuni.sdp.xo.rooms.data.FakeRepositoryFactory.repo.insertOrUpdate(empty);
    }
    return ge.edu.freeuni.sdp.xo.rooms.data.FakeRepositoryFactory.repo;
}